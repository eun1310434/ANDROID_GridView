/*=====================================================================
□ INFORMATION
  ○ Data : 23.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ STUDY
  ○ Adapter를 활용하여 효과적으로 관리

□ FUNCTION
  ○
=====================================================================*/
package com.eun1310434.gridview;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

class ItemAdapter extends BaseAdapter {
    private ArrayList<ItemData> items = new ArrayList<ItemData>();
    private Context ApplicationContext;
    private ItemView view = null;

    public ItemAdapter(Context _context){
        ApplicationContext = _context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void addItem(ItemData item) {
        items.add(item);
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
    return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Log.e("QuestionInfoAcalysisLMA", "getView");
        if( convertView == null) view = new ItemView(ApplicationContext);
        else view = (ItemView) convertView;
        view.setItemView(items.get(position));
        return view;
    }
}
