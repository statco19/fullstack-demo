package fullstack.demo.sudoku.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PuzzleRepository {

    private static final Map<Long, Puzzle> repo = new HashMap<>();
    private static Long sequence = 0L;

    public void save(Puzzle puzzle) {
        puzzle.setId(++sequence);
        repo.put(puzzle.getId(), puzzle);
    }

    public Puzzle findById(Long id) {
        return repo.get(id);
    }

    public List<Puzzle> findAll() {
        List<Puzzle> puzzles = new ArrayList<>(repo.values());
        return puzzles;
    }

    public void clearRepo() {
        repo.clear();
    }
}
