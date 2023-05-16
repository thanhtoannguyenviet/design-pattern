# Iterator pattern
## Mục tiêu
Là một behavior pattern, đc sử dụng để "Cung cấp một cách thức truy cập tuần tự tới các phần tử của một đối tượng tổng hợp, mà không cần phải tạo dựng riêng các phương pháp truy cập cho đối tượng tổng hợp này"
## Vấn đề giải quyết

## Sử dụng khi nào
* Chúng ta có một super class vs nhiều class con và dựa vào đầu vào, ta cần trả về một class con
* Chúng ta không biết sau này cần đến những class con nào nữa. Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc tạo sub class.