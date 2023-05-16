# Singleton factory pattern
## Mục tiêu
Là một creational pattern, đảm bảo chỉ duy nhất một instance của nó đc tạo ra và ta sẻ sử dụng mọi method dựa vào instance này mọi lúc trong chuương trình
## Vấn đề giải quyết
* Giảm bớt độ phức tạp của code hay subsystem bằng cách tạo dựng các cấu hình sẵn.
## Sử dụng khi nào
* Có thể áp dụng để giải quyết các bài toán toàn cần truy cập vào ứng dụng như Shared resource, Caching, Thread pool,...
* Áp dụng trong các creational pattern
## Các singleton thường dùng
* **BillPughSingleton**: thường đc dùng vì hiệu suất cao
* **LazyInitializedSingleton**:thường dùng cho ứng dụng single-thread
* **DoubleCheckLockingSingleton **: thường dùng cho ứng dụng multi-thread





