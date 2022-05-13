package fullstack.demo.sudoku.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Puzzle {
    private Long id;
    private String title;
//    private Integer board[][];

    public Puzzle() {
    }

    public Puzzle(String title) {
        this.title = title;
    }
}
