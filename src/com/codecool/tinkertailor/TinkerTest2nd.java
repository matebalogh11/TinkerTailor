package com.codecool.tinkertailor;

import java.util.LinkedList;
import java.util.List;

public class TinkerTest2nd {
    int n;
    int k;

    public TinkerTest2nd(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List Tinker3rd() {
        List<Integer> players = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        int index = k - 1;
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        while (players.size() > 0) {
            index = index % players.size();
            result.add(players.get(index));
            players.remove(index);
            index = index + (k - 1);

        }
        return result;
    }
}

