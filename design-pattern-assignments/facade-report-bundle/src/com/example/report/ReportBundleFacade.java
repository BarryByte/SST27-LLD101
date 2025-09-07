package com.example.report;

import java.nio.file.*;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {

    // keep one instance of each utility class here.
    // this hides their details from the client
    // if tomorrow we replaced Zipper with another library only facade changes not the client
    
    private final JsonWriter writer;
    private final Zipper zipper ;
    private AuditLog logger;

    public ReportBundleFacade(){
        this.writer = new JsonWriter();
        this.zipper = new Zipper();
        this.logger = new AuditLog();
    }

    // export -> only method client needs

    public Path export(Map<String,Object> data, Path outDir, String baseName){

        // defensive programming : if client passes null -> throw a message
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        // main api logic
        Path json = writer.write(data, outDir, baseName);
        Path zip = zipper.zip(json,outDir.resolve(baseName + ".zip"));
        logger.log("exported " + zip);

        return zip;
    }
    
}
