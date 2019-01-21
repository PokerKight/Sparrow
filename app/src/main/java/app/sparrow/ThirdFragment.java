package app.sparrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView thirdRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_thrid, container, false);

        String[] thirdNames = new String[Third.thirds.length];
        for (int i = 0; i < thirdNames.length; i++){
            thirdNames[i] = Third.thirds[i].getName();
        }

        int[] thirdImages = new int[Third.thirds.length];
        for (int i = 0; i < thirdImages.length; i++){
            thirdImages[i] = Third.thirds[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(thirdNames, thirdImages);
        thirdRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        thirdRecycler.setLayoutManager(layoutManager);
        return thirdRecycler;
    }

}
