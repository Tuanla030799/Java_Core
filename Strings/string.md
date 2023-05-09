## 1. String inspection method

- length: return the number of characters in the string
- chartAt(index): return the character at the index that's passed
- indexOf, lastIndexOf: return an integer, representing the index in the sequence where the string of characters passed, can be located in the string
- isEmpty: return true if length is zero
- isBlank: return true if length is a zero or only contain whitespace characters added in JDK 11

## 2. String comparison

- equals: so sánh chuỗi kí tự, có phân biệt chữ hoa, thường
- equalsIgnoreCase: không phân biệt hoa, thường
- contains: kiểm tra chuỗi có chứa chuỗi con này hay không ?
- contentEquals: isn't limited (được sử dụng để so sánh StringBuilder's value, giá trị mà equal ko hỗ trợ)

## 3. String handle

- indent(index): thụt vào lề trái 1 khoản index
- strip, stripLeading, stripTrailing, trim: loại bỏ khoảng trắng (strip hỗ trợ large set whitespace)
- toLowerCase, toUpperCase
- concat: nối chuỗi
- join(...,...): thêm vào chuỗi giá trị mong muốn
- repeat: lặp lại số lần y/c
- replace: thay thế (recommend)
- replaceAll: thay thế tất cả (cả biểu thức chính quy)
- replaceFirst: thay thế giá trị đầu tiên
- subString(index), subSequence: return subString

## 4. String Builder

- Strings là bất biến (immutable)
- Mỗi phương thức gọi trả về một instance của chuỗi|

=> Java cung cấp một mutable class (có thể thay đổi giá trị văn bản) => StringBuilder

**ex**: `StringBuilder helloBuilder = new StringBuilder("Hello");`

- String method: create a new Object in memory and return a reference to this new Object
- StringBuilder method: return a StringBuilder reference, but it's really a self-reference
- capacity StringBuilder default is 16

* **Method**:

  - delete, deleteCharAt
  - insert(index)
  - reverse
  - setLength
  - append

* **Note**:
  - thường thì sẽ sử dụng Strings nhiều hơn
  - StringBuilder thường đc lựa chọn tốt hơn khi tạo và thao tác với văn bản.
