package kagudkov.fragments;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FrameFragment extends Fragment  implements INavigationListener{

    private Button mNextButton;

    @Override
    public void onNextClick() {
        LinearFragment linearFragment = new LinearFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, linearFragment).commit();
    }

    @Override
    public void onPrevClick() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  v = inflater.inflate(R.layout.frame_layout, container, false);
        mNextButton = (Button) v.findViewById(R.id.frame_layout_next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextClick();
            }
        });
        return v;

    }
}