package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter{
    // CsvProfileImporter adapts NaiveCsvReader => ProfileService.
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = Objects.requireNonNull(reader);
        this.service = Objects.requireNonNull(service);
    }

    @Override
    public int importFrom(Path csvFile) {
        int successCount = 0;
        List<String[]> rows = reader.read(csvFile);

        for (int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);
            if (row.length < 3) {
                System.out.println("Skipping row " + (i + 1) + ": not enough columns");
                continue;
            }
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();

            if (id.isEmpty() || email.isEmpty()) {
                System.out.println("Skipping row " + (i + 1) + ": missing id/email");
                continue;
            }
            if (!email.contains("@")) {
                System.out.println("Skipping row " + (i + 1) + ": bad email");
                continue;
            }

            try {
                service.createProfile(id, email, displayName);
                successCount++;
            } catch (Exception e) {
                System.out.println("Skipping row " + (i + 1) + ": " + e.getMessage());
            }
        }
        return successCount;
    }
    
}
