# Factory Method pattern
## Mục tiêu
Là một creational pattern, định nghĩa 1 interface tạo ra đối tượng nhưng để cho lớp con quyết định lớp nào đc dùng để tạo ra đối tượng.
## Vấn đề giải quyết
* Che giấu quá trình xử lý logic của phương thức khởi tạo
* Dễ dàng mở rộng, thêm đoạn code mới vào mà ko phá vỡ đối tượng ban đầu
## Sử dụng khi nào
* Chúng ta có một super class vs nhiều class con và dựa vào đầu vào, ta cần trả về một class con
* Chúng ta không biết sau này cần đến những class con nào nữa. Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc tạo sub class.