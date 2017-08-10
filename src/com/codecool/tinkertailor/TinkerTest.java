package com.codecool.tinkertailor;
import java.util.ArrayList;
import java.util.List;


public class TinkerTest {

    int n, k;

    public TinkerTest(int n, int k) {
        this.n = n;
        this.k = k;
    }
    public List Tinker2nd() {
        List<Integer> players = new ArrayList<>();
        List<Integer> scoreList = new ArrayList<>();
        int step = k - 1;
        int index = step;
        int temp;
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        if (step >= players.size()) {
            index = step % players.size();
        }
        while (players.size() > 1) {
            if (index < 0) {
                int RecalculatedIndex = players.size() + index;
                scoreList.add(players.get(RecalculatedIndex));
                players.remove(players.get(RecalculatedIndex));
                index += 1;
            } else {
                scoreList.add(players.get(index));
                players.remove(players.get(index));
            }
            temp = index + step;
            index = temp - players.size();
            while (Math.abs(index) >= players.size()) {
                if (index < 0) {
                    index += players.size();
                } else {
                    index -= players.size();
                }
            }
        }
        scoreList.add(players.get(0));
        return scoreList;
    }
}
