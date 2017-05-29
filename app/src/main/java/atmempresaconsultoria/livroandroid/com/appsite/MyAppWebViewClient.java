package atmempresaconsultoria.livroandroid.com.appsite;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Karthik's on 3/5/2015.
 */
public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        // nolugar de cont..net.br era karthiktechfreak.blogspot.in
        if(Uri.parse(url).getHost().endsWith("contabilidadeuniversal.net.br")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}