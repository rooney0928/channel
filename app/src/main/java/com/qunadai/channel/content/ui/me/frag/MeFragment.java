package com.qunadai.channel.content.ui.me.frag;

import android.os.Bundle;
import android.view.View;

import com.qunadai.channel.R;
import com.qunadai.channel.content.base.BaseFragment;

/**
 * Created by wayne on 2017/8/28.
 */

public class MeFragment extends BaseFragment {

    public static MeFragment getInstance() {
        MeFragment meFragment = new MeFragment();
        Bundle bundle = new Bundle();
        meFragment.setArguments(bundle);
        return meFragment;
    }
    @Override
    protected void initBundle(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected View createRootView() {
        View root = View.inflate(getActivity(), R.layout.fragment_me, null);
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
