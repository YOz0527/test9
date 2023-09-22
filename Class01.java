class CRectangle {
    int width;
    int height;

    // 使用引數的建構元，自動設定width和height
    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    // 沒有引數的建構元，設定width=10和height=8，不使用this()
    public CRectangle() {
        width = 10;
        height = 8;
    }

    // 沒有引數的建構元，使用this()設定width和height
    public CRectangle() {
        this(10, 8);
    }
}
