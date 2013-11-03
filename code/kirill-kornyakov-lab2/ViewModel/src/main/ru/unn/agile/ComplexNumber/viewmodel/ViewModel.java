package ru.unn.agile.ComplexNumber.viewmodel;

import ru.unn.agile.ComplexNumber.model.ComplexNumber;

public class ViewModel
{
    public String re1 = "";
    public String im1 = "";
    public String re2 = "";
    public String im2 = "";
    public Operation operation = Operation.ADD;
    public String result = "";
    public String status = Status.DEFAULT;
    public boolean isCalculateButtonEnabled = false;

    public enum Operation {
        ADD ("Add"),
        MULTIPLY ("Mul");

        private final String name;

        private Operation(String s) {
            name = s;
        }

        public String toString() {
            return name;
        }
    }

    public class Status {
        public static final String DEFAULT = "Please provide input data";
        public static final String OK = "Press 'Calculate' or Enter";
        public static final String BAD_FORMAT = "Bad format";
        public static final String SUCCESS = "Success";
    }

    public boolean parseInput() {
        try {
            if (!re1.isEmpty()) Double.parseDouble(re1);
            if (!im1.isEmpty()) Double.parseDouble(im1);
            if (!re2.isEmpty()) Double.parseDouble(re2);
            if (!im2.isEmpty()) Double.parseDouble(im2);
        }
        catch (Exception e) {
            status = Status.BAD_FORMAT;
            isCalculateButtonEnabled = false;
            return false;
        }

        isCalculateButtonEnabled = IsInputAvailable();
        if (isCalculateButtonEnabled) {
            status = Status.OK;
        }
        else {
            status = Status.DEFAULT;
        }

        return isCalculateButtonEnabled;
    }

    private boolean IsInputAvailable() {
        return !re1.isEmpty() && !im1.isEmpty() && !re2.isEmpty() && !im2.isEmpty();
    }

    public void calculate()
    {
        if (!parseInput()) return;

        ComplexNumber z1 = convertToComplexNumber(re1, im1);
        ComplexNumber z2 = convertToComplexNumber(re2, im2);
        ComplexNumber z3 = new ComplexNumber();

        switch (operation) {
            case ADD:
                z3 = z1.add(z2);
                break;
            case MULTIPLY:
                z3 = z1.multiply(z2);
                break;
        }

        result = z3.toString();
        status = Status.SUCCESS;
    }

    public ComplexNumber convertToComplexNumber(String re, String im) {
        return new ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
    }
}
