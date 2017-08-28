package com.qunadai.channel.content.ui.home.frag;

import android.os.Bundle;
import android.view.View;

import com.qunadai.channel.R;
import com.qunadai.channel.content.base.BaseFragment;

/**
 * Created by wayne on 2017/8/28.
 */

public class HomeFragment extends BaseFragment {

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
