package ru.IrenDemchenkova;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int src :
                source) {
            if (src < treshold) {
                result.add(src);
                logger.log("Element " + src + " fits");
            } else {
                logger.log("Element " + src + " doesn't fit");
            }

        }
        return result;
    }
}
