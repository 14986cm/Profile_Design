import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.profiledesign.R // Make sure to replace "yourpackage" with your actual package name

class YourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Set the content view to your profile layout XML
    }

    fun openFacebook(view: View) {
        val facebookUrl = "https://www.facebook.com/BIBLEOFMYSELF/"
        openUrlInBrowser(facebookUrl)
    }

    fun openInstagram(view: View) {
        val instagramUrl = "https://www.instagram.com/1.4986m/"
        openUrlInBrowser(instagramUrl)
    }

    fun openLinkedIn(view: View) {
        val linkedInUrl = "https://www.linkedin.com/in/joana-grace-garcia-205921248/"
        openUrlInBrowser(linkedInUrl)
    }

    fun openGitHub(view: View) {
        val githubUrl = "https://github.com/14986cm"
        openUrlInBrowser(githubUrl)
    }

    private fun openUrlInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}

open class AppCompatActivity {

}
