// (a) 定义 CCount 类，用于追踪对象创建的数量
class CCount {
    // (a) count() 函数，每次调用时将 cnt 的值加1，用于记录对象创建的数量
    public void count() {
    }

    // (b) setZero() 函数，将 cnt 的值归零
    public void setZero() {
    }

    // (c) setValue(int n) 函数，将 cnt 的值设置为参数 n 的值
    public void setValue(int n) {
    }

    // (d) 在本例中，cnt 变量应该利用「实例变量」，因为每个对象都需要独立追踪自己的数量
    // 如果使用类变量（静态变量），将会导致所有对象共享相同的 cnt 值，不符合需求

    // (e) count() 函数应该宣告成「实例函数」，因为它操作的是实例变量 cnt，每个对象都有自己的 cnt 值
}
