package com.leus;

public enum ColorsOfShapes {
    WHITE("белый"),
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("синий"),
    PURPLE("фиолетовый"),
    BROWN("коричневый"),
    GRAY("серый"),
    BLACK("черный");

    private String color;

    ColorsOfShapes(String color) {
        this.color = color;
    }

    public String getColorAsString() {
        return color;
    }

    public static ColorsOfShapes getColorFromNumber(int num) {
        switch (num) {
            case 1:
                return WHITE;
            case 2:
                return RED;
            case 3:
                return ORANGE;
            case 4:
                return YELLOW;
            case 5:
                return GREEN;
            case 6:
                return BLUE;
            case 7:
                return PURPLE;
            case 8:
                return BROWN;
            case 9:
                return GRAY;
            case 10:
                return BLACK;

            default:
                throw new IllegalArgumentException("Number must be >= 1 && <= 10, current number is : " + num);
        }
    }
}
