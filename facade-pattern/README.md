# Facade pattern
## Mục tiêu
Là một structural pattern, điều khiển gián tiếp một object thông qua một đối tượng đc ủy quyền 
## Vấn đề giải quyết
* **Lazy initialization (virtual proxy):** Khi bạn có một đối tượng dịch vụ nặng gây lãng phí tài nguyên hệ thống do luôn hoạt động, mặc dù thỉnh thoảng bạn chỉ cần nó.
* **Access control (protection proxy):** Khi bạn muốn chỉ những khách hàng cụ thể mới có thể sử dụng đối tượng dịch vụ.
* **Local execution of a remote service (remote proxy):** Đây là khi đối tượng service được đặt trên một máy chủ từ xa.
* **Logging requests (logging proxy):** Khi bạn muốn giữ lịch sử của các yêu cầu đối với đối tượng service.
* **Caching request results (caching proxy):** Khi bạn cần lưu trữ kết quả của các yêu cầu máy khách và quản lý vòng đời của bộ nhớ cache này, đặc biệt nếu kết quả khá lớn.
* **Smart reference:** Khi bạn cần loại bỏ một đối tượng nặng khi không có máy khách nào sử dụng nó.
## Sử dụng khi nào
* Cải thiện Performance thông qua lazy loading (virtual proxy)
* Bảo vệ dối tượng thật khỏi thế giới bên ngoài (protection proxy)