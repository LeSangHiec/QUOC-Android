package com.example.lab06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.model.SanPham;

public class ChiTietActivity extends AppCompatActivity {
    EditText edtMa,edtTen,edtGia;
    Button btnXoa,btnThoat;
    Intent intent;
    SanPham sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chi_tiet);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
        addEvent();
    }

    private void addEvent() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kết thúc Activity hiện tại và quay lại màn hình trước đó
                finish();
            }
        });

// Xử lý sự kiện khi nhấn nút "Xóa sản phẩm"
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gửi đối tượng sản phẩm cần xóa về MainActivity
                intent.putExtra("SANPHAM", sp);
                setResult(115, intent); // Mã kết quả là 115 (xác định việc xóa sản phẩm)
                finish(); // Kết thúc Activity hiện tại
            }
        });
    }

    private void addView() {
        // Ánh xạ các View từ layout
        edtMa = findViewById(R.id.edtMaSP);
        edtTen = findViewById(R.id.edtTenSP);
        edtGia = findViewById(R.id.edtGiaSP);
        btnXoa = findViewById(R.id.btnXoa);
       

// Lấy Intent được truyền từ MainActivity
        intent = getIntent();
        sp = (SanPham) intent.getSerializableExtra("SANPHAM"); // Lấy đối tượng SanPham

// Hiển thị thông tin sản phẩm lên giao diện
        edtMa.setText(sp.getMa());
        edtTen.setText(sp.getTen());
        edtGia.setText(String.valueOf(sp.getGia())); // Chuyển giá sang chuỗi

    }
}