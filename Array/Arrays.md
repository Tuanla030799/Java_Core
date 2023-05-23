## 1. Concept

- An Array is a data structure (Cau truc du lieu) that allows you to store a sequence (chuoi) of values, all of the same types
- Elements in arrays are indexed, starting at 0
- Array is not resizeable (ko the thay doi kich thuoc)
- An array is a special class in java, inherits from java.lang.Object

## 2. Method

- `Arrays.toString(newArray)`
- `Arrays.sort(someArray)` (sap xep truc tiep)
- `Arrays.fill(array, value)` (Thay the gia tri trong mang = value)
- `Arrays.copyOf(array, length)` (Copy array and return new instance Array)
- `Arrays.binarySearch(array)`
  - Tìm kiếm phổ biến nhất => binarySearch => java cung cấp tính năng tìm kiếm nayf trên nhiều collection
  - static method, binarySearch is on the java class
  - Mảng phải đc sắp xếp và có thể có giá trị trùng
  - Return:
    - the `position` of the match if found
    - `-1` when no match was found
    - may not be the position of the first match
    - if your array has duplicate values, and you need to find the first element, other method should be used

## 3. references type vs value type

- `reference` : tham chiếu lưu trữ địa chỉ vùng nhớ trỏ đến vùng nhớ đó
- example:

  ```
  int[] myArray = new int[5];
  int [] anotherArray = myArray;

  anotherArray[0] = 10;

  => (myArray[0] = 10) true;

  ```
