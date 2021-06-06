package com.example.dialogex;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //대화상자 (dialog)
    //1.대화상자 생성 2.용도에 따른 설정 3.화면출력
    Button dtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dtnDialog = (Button)findViewById(R.id.btnDialog);
        dtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                //다이얼로그 인스턴트 객체 생성 매개값으로 배치하는 장소를 입력

                builder.setTitle("공지사항");
                builder.setIcon(R.drawable.bob);
                builder.setMessage("코로나 예방을 위하여 마스크를 꼭 착용합시다."); //대화상자 내용
                builder.setPositiveButton("확인", null);
                //setNaturalButton등이 있는데 버튼 배치마다 이름이 조금씩 다르다
                //버튼글씨, 매개값 첫번째는 텍스트, 두번째는 수행할 다음 기능이 없으면null, new하여 새로운 기능을 실행할수 있음
                //new DialogInterface.OnClickListener() {
                //   @Override
                //   public void onClick(DialogInterface dialog, int which) {
                //   Toast.makeText(getApplicationContext(), "확인을 눌렀네요", Toast.LENGTH_SHORT).show();
                //    }
                //   });

                //대화상자를 호출했을때 빈곳에 아무데나 누르면 사라지긴 한다. 그러나 그렇게 잘 안만든다.
                builder.setCancelable(false); //안쓰면 true가 default


                AlertDialog dialog = builder.create();//화면에 보여주기 위한 객체생성
                //builder.show(); //30행 없애고
                dialog.show();
                //왜 AlertDialog 타입에 대입할까? FM이라는데...



            }
        });
    }

}