package com.example.ijangmin.stock;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2019-05-19.
 */

public class DeleteRequest extends StringRequest {
    //현재 안드로이드앱을 에뮬레이터로 돌리므로 에뮬레이터가 설치된 서버에 있는 아파치 서버에 접근하려면
    //다음과 같이 10.0.2.2:포트번호 로 접근해야합니다 저는 8080 포트를 써서 다음과 같이 했습니다
    final static private String URL = "http://stock123.dothome.co.kr/Delete.php";
    private Map<String, String> parameters;
    public DeleteRequest(String productNum, Response.Listener<String> listener){
        super(Request.Method.POST, URL, listener, null);//Post방식임
        parameters = new HashMap<>();//해쉬맵 생성후 parameters 변수에 값을 넣어줌
        parameters.put("productNum", productNum);
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}

