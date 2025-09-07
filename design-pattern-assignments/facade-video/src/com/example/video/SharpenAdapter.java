package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen legacy = new LegacySharpen();

    public Frame[] applySharpen(Frame[] frames, int strength) {
        // Step 1: Convert frames => handle string
        String handle = "HANDLE:" + frames.length + "frames";

        // Step 2: Call legacy API
        String newHandle = legacy.applySharpen(handle, strength);

        // Step 3: Convert back to frames , pretend
        System.out.println("Sharpen applied via legacy API, result handle: " + newHandle);
        return frames; 
    }

}
