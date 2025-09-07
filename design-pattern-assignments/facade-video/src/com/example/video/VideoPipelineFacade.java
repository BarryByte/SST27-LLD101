package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder = new Decoder();
    private final FilterEngine filters = new FilterEngine();
    private final Encoder encoder = new Encoder();
    private final SharpenAdapter sharpenAdapter = new SharpenAdapter();
    
    
    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        // Step 1: Decode
        Frame[] frames = decoder.decode(src);

        // Step 2: Optional grayscale
        if (gray) {
            frames = filters.grayscale(frames);
        }

        // Step 3: Optional scale
        if (scale != null) {
            frames = filters.scale(frames, scale);
        }

        // Step 4: Optional sharpen (legacy => adapted)
        if (sharpenStrength != null) {
            frames = sharpenAdapter.applySharpen(frames, sharpenStrength);
        }

        // Step 5: Encode
        return encoder.encode(frames, out);
    }
}