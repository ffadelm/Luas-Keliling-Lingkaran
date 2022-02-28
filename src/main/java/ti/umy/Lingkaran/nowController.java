package ti.umy.Lingkaran;

import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class nowController {
    @RequestMapping("/hasil")
    public String getHasil(Model model, HttpServletRequest param){
        String jari = param.getParameter("jari");
        double phi = 3.14;
        double luas, keliling;
        double r = Double.parseDouble(jari);
        
        luas = 0.5 * phi * r * r;
        keliling = 2 * phi * r;
        
        DecimalFormat df = new DecimalFormat("#.##");
        model.addAttribute("Jari", jari);
        model.addAttribute("Luas", luas);
        model.addAttribute("Keliling", df.format(keliling));
        
        return "index";
    }
}