package de.szut.loos.mapdemo;

import lombok.Data;
import lombok.NonNull;

@Data
public class Color {
    @NonNull int red;   // 0 - 255
    @NonNull int green; // 0 - 255
    @NonNull int blue;  // 0 - 255
}
