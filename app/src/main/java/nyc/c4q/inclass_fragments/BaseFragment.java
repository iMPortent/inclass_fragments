package nyc.c4q.inclass_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MarckemX on 11/19/17.
 */

public abstract class BaseFragment extends Fragment {

    @LayoutRes
    protected abstract int getLayoutId();

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle bundle){
        View view = inflater.inflate(getLayoutId(), container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Activity activity = getActivity();
        if(activity instanceof MainActivity){
            ((MainActivity) activity).frenchToast();
        }
    }
}
