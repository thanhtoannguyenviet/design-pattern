# Prototype pattern
## Mục tiêu
Là một creational pattern, nó có nhiệm vụ tạo ra một đối tượng khác bằng việc clone đối tượng đã tồn tại.
## Vấn đề giải quyết
* Giảm việc phân lớp, tránh việc tạo nhiều lớp con cho việc khởi tạo
* 
## Sử dụng khi nào
* Chúng ta có một super class vs nhiều class con và dựa vào đầu vào, ta cần trả về một class con
* Chúng ta không biết sau này cần đến những class con nào nữa. Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc tạo sub class.