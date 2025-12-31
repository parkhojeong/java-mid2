package collection.compare.test;

enum CardType implements Comparable<CardType>{
    CLUB("\u2666", 1),
    DIAMOND("\u2663", 2),
    HEART("\u2660", 3),
    SPADE("\u2665", 4);

    private String icon;
    private final int printOrder;
    CardType(String icon, int printOrder) {
        this.icon = icon;
        this.printOrder = printOrder;
    }

    public String getIcon() {
        return icon;
    }

    public int getPrintOrder() {
        return printOrder;
    }

}