package com.codecool.tinkertailor;
import java.util.*;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List Tinker1st() {
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

    public List Tinker2nd() {
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
            index = index + (k - 1); // += is not accepted..?
        }
        return result;
    }

    public Set Tinker3rd() {
        Set<Integer> players = new TreeSet<>();
        Set<Integer> result = new LinkedHashSet<>();
        int index = k - 1;
        int counter;
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        while (!players.isEmpty()) {
            counter = 0;
            index = index % players.size();
            for (int i: players) {
                if (counter == index) {
                    players.remove(i);
                    result.add(i);
                    break;
                }
                counter ++;
            }
            index = index + (k - 1);
        }
        return result;
    }
}

