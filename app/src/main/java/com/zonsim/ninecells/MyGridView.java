package com.zonsim.ninecells;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * CopyRight
 * Created by tang-jw on 2016/6/20.
 */
public class MyGridView extends GridView {
	
	private Context mContext;
	
	public String[] img_text = {"转账", "余额宝", "手机充值", "信用卡还款", "淘宝电影", "彩票",
			"当面付", "亲密付", "机票",};
	public int[] imgs = {R.drawable.app_transfer, R.drawable.app_fund,
			R.drawable.app_phonecharge, R.drawable.app_creditcard,
			R.drawable.app_movie, R.drawable.app_lottery,
			R.drawable.app_facepay, R.drawable.app_close, R.drawable.app_plane};
	
	public MyGridView(Context context) {
		super(context);
		mContext = context;
	}
	
	public MyGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public MyGridView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}
}
