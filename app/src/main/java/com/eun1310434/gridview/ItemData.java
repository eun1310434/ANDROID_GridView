/*=====================================================================
□ Infomation
  ○ Data : 08.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ Item class

□ Study
  ○
=====================================================================*/
package com.eun1310434.gridview;

public class ItemData {

    String title;
    String contents;
    int num;
    int imgRes;

    public ItemData(String title, String contents, int num, int imgRes) {
        this.title = title;
        this.contents = contents;
        this.num = num;
        this.imgRes = imgRes;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

