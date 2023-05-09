## 1. OverLoading

- Cung cấp hai hay nhiều phương thức riêng biệt trong một lớp, cùng tên nhưng khác tham số (số lượng tham số truyền vào or kiểu dữ liệu)
- Giảm số lượng mã trùng lặp và không phải nhớ quá nhiều tên, phương thức
- Có thể sd `Overload method` or `Instance method`
- `Compile-time polymorphism`
- Xảy ra trong một lớp duy nhất

## 2. OverRiding

- Xác định một phương thức trong lớp con mà tồn tại trong lớp cha có cùng chữ kí (tên method, đối số)
- mở rộng lớp cha => lớp con có thể nhận được các method lớp cha thong qua `super()`
- xảy ra trên 2 lớp có quan hệ kế thừa
