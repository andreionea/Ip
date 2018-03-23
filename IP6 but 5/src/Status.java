public enum Status {
    IN_STORAGE("Is in storatge"),
    ON_ROUTE("Is on route"),
    CURRIER_STORAGE("Is in courrier's storage"),
    DELIVERED("This has been delivered");

    private String string;

    Status(String string) {
        this.string = string;
    }

    public String toString() {
        return this.toString();
    }

}
