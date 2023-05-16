# Bridge pattern
## Mục tiêu
Là một structural pattern, dùng để tách tính trừu tượng ra khỏi tính hiện thực của nó. Nhờ vậy ta có thể dễ dàng chỉnh sữa hay thay thế mà ko làm ảnh hưởng đến những nơi có sử dụng lớp ban đầu
## Vấn đề giải quyết
* Giảm sự phụ thuộc vào abstraction và implementation
* Code sẻ gọn gàn hơn và kích thước ứng dụng sẻ nhỏ hơn
* Dễ bảo trì, dễ mở rộng về sau
## Sử dụng khi nào
* Khi muốn tách ràng buộc của abstraction và implementation
* Sử dụng ở những nơi m những thay đổi đc thực hiện trong implement không ảnh hưởng đến phía client
* Abstraction và implementation của chúng nên đc mở rộng bằng subclass