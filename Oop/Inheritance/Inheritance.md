## 1. Inheritance

- code re-use
- Cho phép phần tử con kế thừa(sử dụng lại) các field, method public, private của lớp cha

* `Super()`:
  - không giống `this()`
  - là một cách gọi hàm trên `super class`, trực tiếp từ hàm tạo trên lớp con
  - được gọi đầu tiên => không tồn tại `super()` và `this()` trên cùng một constructor

- tất cả các lớp con có thể thực thi các method trên lớp cha

## 2. Java.lang.object

- tất cả các class kế thiwfa từ đối tượng này => có thể ghi đè nó
  - `clone(): Object`
  - `equal(Object object) : boolean`
  - `hashCode(): int`
  - `toString(): String`
