package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {

			// Admin
			User user1 = new User("admin", pwEncoder.encode("admin123"), "admin@library.com", "Admin", "1", "123 Admin Street", "0123456789", "Da Nang");
			user1.setRole("ROLE_ADMIN");

			// Employee 1
			User user2 = new User("employee1", pwEncoder.encode("employee123"), "employee1@library.com", "employee", "1", "456 Employee St", "0987654321", "Da Nang");
			user2.setRole("ROLE_EMPLOYEE");

			// User 1
			User user3 = new User("user1", pwEncoder.encode("user123"), "user1@library.com", "user", "1", "789 User St", "0932345678", "Da Nang");
			user3.setRole("ROLE_USER");

			usService.save(user1);
			usService.save(user2);
			usService.save(user3);


			Book book1 = new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 1941, 1);
			Book book2 = new Book("Nhật Ký Đặng Thùy Trâm", "Đặng Thùy Trâm", 2005, 2);
			Book book3 = new Book("Chí Phèo", "Nam Cao", 1941, 1);
			Book book4 = new Book("Sống và Khát Vọng", "Nguyễn Ngọc Tư", 2018, 4);
			Book book5 = new Book("Mắt Biếc", "Nguyễn Nhật Ánh", 1997, 5);
			Book book6 = new Book("Tắt Đèn", "Ngô Tất Tố", 1939, 1);
			Book book7 = new Book("Truyện Kiều", "Nguyễn Du", 1820, 3);
			Book book8 = new Book("Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Nguyễn Nhật Ánh", 2010, 1);
			Book book9 = new Book("Dòng Sông Hối Lỗi", "Nguyễn Mạnh Tuấn", 2012, 2);
			Book book10 = new Book("Cô Gái Đến Từ Hôm Qua", "Nguyễn Nhật Ánh", 2011, 3);
			Book book11 = new Book("Bến Không Chồng", "Dương Hướng", 1990, 1);
			Book book12 = new Book("Cái Hồn Dân Tộc", "Nguyễn Thị Minh Châu", 1994, 1);
			Book book13 = new Book("Lão Hạc", "Nam Cao", 1943, 1);
			Book book14 = new Book("Vợ Chồng A Phủ", "Tô Hoài", 1954, 3);
			Book book15 = new Book("Đất Rừng Phương Nam", "Đoàn Giỏi", 1997, 2);
			Book book16 = new Book("Đoạn Tuyệt", "Nguyễn Công Hoan", 1957, 1);
			Book book17 = new Book("Giữa Lòng Hà Nội", "Nguyễn Khải", 1992, 2);
			Book book18 = new Book("Chân Trời Cũ", "Nguyễn Quang Sáng", 2013, 1);
			Book book19 = new Book("Chuyện Cũ", "Nguyễn Đình Thi", 2001, 4);
			Book book20 = new Book("Ngày Xưa Có Một Con Rồng", "Trí Nguyễn", 2018, 2);
			Book book21 = new Book("Rừng Xà Nu", "Nguyễn Trung Thành", 1994, 1);
			Book book22 = new Book("Thời Gian Lặng Lẽ", "Nguyễn Phan Quế Mai", 2019, 6);
			Book book23 = new Book("Cánh Đồng Bất Tận", "Nguyễn Ngọc Tư", 2003, 1);
			Book book24 = new Book("Đàn Hương Hương", "Nguyễn Tường Thiết", 2015, 3);
			Book book25 = new Book("Những Ngày Nước Lũ", "Dương Thụy", 2007, 1);
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
