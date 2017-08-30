package com.qunadai.channel.content.ui.home.frag;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.qunadai.channel.R;
import com.qunadai.channel.content.adapter.HomeMenuAdapter;
import com.qunadai.channel.content.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by wayne on 2017/8/28.
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.rv_menu)
    RecyclerView rv_menu;

    GridLayoutManager gridLayoutManager;
    HomeMenuAdapter menuAdapter;


    public static HomeFragment getInstance() {
        HomeFragment homeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

    @Override
    protected void initBundle(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        menuAdapter = new HomeMenuAdapter(getActivity());
        gridLayoutManager = new GridLayoutManager(getActivity(), 3){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        rv_menu.setLayoutManager(gridLayoutManager);
        rv_menu.setAdapter(menuAdapter);

    }

    @Override
    protected View createRootView() {
        View root = View.inflate(getActivity(), R.layout.fragment_home, null);
        return root;
    }

    @Override
    public void requestStart() {

    }

    @Override
    public void requestEnd() {

    }

    @Override
    public void tokenFail() {

    }


}
