package fullstack.demo.web.basic;

import fullstack.demo.sudoku.domain.Puzzle;
import fullstack.demo.sudoku.domain.PuzzleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/puzzles")
public class PuzzleController {

    private final PuzzleRepository puzzleRepository;

    @GetMapping
    public List<Puzzle> getPuzzles() {
        return puzzleRepository.findAll();
    }

    @PostConstruct
    public void init() {
        puzzleRepository.save(new Puzzle("titleA"));
        puzzleRepository.save(new Puzzle("titleB"));
    }
}
