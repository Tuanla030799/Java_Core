## 1. Basic concept

- `Inheritance` define a **IS-A** relationship
- `Composition` define a **HAS-A** relationship

  => `Composition` là cách tạo sự kết hợp giữa các lớp, sử dụng lớp trong một lớp

## 2. Use Composition or Inheritance or Both

- `Composition` linh hoạt hơn, có thể thêm hoặc loại bỏ chúng, ít có khả năng tác độgn xuôi dòng
- `Inheritance` phá vỡ tính đóng gói vì các lớp con có thể truy cập trực tiếp vào hành vi của cha mẹ
- `Inheritance` kém linh hoạt, khi xoá lớp cha sẽ ảnh hưởng đến lớp con
- Lớp con có thể không cần đến tất cả các chức năng thuộc tính của lớp cha

  => nên sử dụng `Composition` khi có thể.
