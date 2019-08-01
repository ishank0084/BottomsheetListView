package com.ishank.ibm.bottomsheetlistscroll;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;

/**
 * Created by Ishank Shukla on 31-July-2019
 */
public class BottomSheetListView extends ListView {

    public BottomSheetListView(Context pContext, AttributeSet pAttrs) {
        super(pContext, pAttrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent pEvent) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent pEvent) {
        if (canScrollVertically(this)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(pEvent);
    }

    public boolean canScrollVertically(AbsListView view) {

        boolean canScroll = false;

        if (view != null && view.getChildCount() > 0) {

            boolean isOnTop = view.getFirstVisiblePosition() != 0 || view.getChildAt(0).getTop() != 0;
            boolean isAllItemsVisible = isOnTop && getLastVisiblePosition() == view.getChildCount();

            if (isOnTop || isAllItemsVisible)
                canScroll = true;
        }

        return canScroll;
    }

}