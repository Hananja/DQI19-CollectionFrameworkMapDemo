package de.szut.loos.mapdemo;

import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

@Data // equals(...), hashCode(), Getter, Setter, usw. (projectlombok.org)
public class Coordinate implements Comparable<Coordinate>
{
    private @NonNull Integer x, y;

    @Override
    public int compareTo(@NotNull Coordinate o) {
        //  nur bei Gleichheit von x y vergleichen
        var compare_x = Integer.compare(x, o.x);
        if( 0 == compare_x ) {
            return Integer.compare(y, o.y);
        } else {
            return compare_x;
        }
    }
}
