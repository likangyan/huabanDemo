package licola.demo.com.huabandemo.API;

import android.view.View;

import licola.demo.com.huabandemo.Bean.PinsAndUserEntity;

/**
 * Created by LiCola on  2016/04/04  23:31
 * 所有有pins对象列表的 共用接口
 */
public interface OnPinsFragmentInteractionListener {
    void onClickPinsItemImage(PinsAndUserEntity bean, View view);

    void onClickPinsItemText(PinsAndUserEntity bean, View view);
}
