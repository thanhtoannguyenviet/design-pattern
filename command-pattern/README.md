# Command pattern
## Mục tiêu
Là một behavior pattern cho phép chuyển các request chuyển tới object đc lưu trữ trong object dưới dạng 1 object
## Vấn đề giải quyết
* Giảm việc phân lớp, tránh việc tạo nhiều lớp con cho việc khởi tạo
*
## Sử dụng khi nào
* Chúng ta có một super class vs nhiều class con và dựa vào đầu vào, ta cần trả về một class con
* Chúng ta không biết sau này cần đến những class con nào nữa. Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc tạo sub class.