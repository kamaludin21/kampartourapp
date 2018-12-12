package skypea.domain.tourisapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FragmentDua extends Fragment {
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_dua, container, false);

        View v =  inflater.inflate(R.layout.fragment_dua, container, false);

        WebView webView = (WebView) v.findViewById(R.id.fragment_dua);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://alumni.kamaludin.ga/ai/index.php?module=tibadah");

        return v;
    }
}
