package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userService;
	
	@Autowired
	public void configureClobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "/about").permitAll()
		.antMatchers("/css/*","/css/colors/*", "/*","/fonts/roboto/*","/js/*",

				"/assets/bootstrap/css/*",
				"/assets/bootstrap/fonts/*","/assets/bootstrap/js/*","/assets/css/*","/js/glow/*",
				"/assets/font-awesome/css/*","/assets/font-awesome/fonts/*","/assets/font-awesome/less/*",
				"/assets/font-awesome/scss/*","/assets/ico/*","/assets/img/backgrounds/*","/assets/js/*",

				"/assets2/*","/assets2/css/*","/assets2/fonts/*","/assets2/img/*","/assets2/scripts/*","/assets2/scripts/font-awesome/fonts*",
				"/assets2/scripts/font-awesome/css/*","/assets2/plugins/*","/assets2/plugins/bootstrap/*","/assets2/plugins/dataTables/*",
				"/assets2/plugins/flot/*","/assets2/plugins/metisMenu/*","/assets2/plugins/morris/*","/assets2/plugins/pace/*",
				"/assets2/plugins/social-buttons/*","/assets2/plugins/timeline/*",


				"/bootstrap/dist/css/*","/bootstrap/dist/fonts/*","/bootstrap/dist/js/*","/bootstrap/dist/css/*","/bootstrap/dist/fonts/*",
				"/bootstrap/fonts/*","/bootstrap/grunt/*","/bootstrap/js/*","/bootstrap/less/*","/bootstrap/less/mixins/*","/bootstrap/*"

				,"/js/glow/1.7.0/*","/js/glow/1.7.0/core/*",
				"/js/glow/1.7.0/widgets/*","/js/glow/1.7.0/widgets/images/*","/js/glow/1.7.0/widgets/images/carousel/*",
				"/js/glow/1.7.0/widgets/images/darkpanel/*","/js/glow/1.7.0/widgets/images/editor/*",
				"/js/glow/1.7.0/widgets/images/lightpanel/*","/js/glow/1.7.0/widgets/images/slider/*",
				"/js/glow/1.7.0/widgets/images/timetable/*",

				"/less/*","/less/colors/*","/less/icons/font-awesome/*",
				"/less/icons/font-awesome/css/*","/less/icons/font-awesome/fonts/*","/less/icons/font-awesome/less/*",
				"/less/icons/font-awesome/scss/*",

				"/plugins/bower_components/*","/plugins/images/*",
				"/plugins/bower_components/counterup/*","/plugins/bower_components/gmaps/*","/plugins/bower_components/jquery/*",
				"/plugins/bower_components/morrisjs/*","/plugins/bower_components/raphael/*","/plugins/bower_components/sidebar-nav/*",
				"/plugins/bower_components/toast-master/*","/plugins/bower_components/waypoints/*","/plugins/bower_components/gmaps/lib/*",
				"/plugins/bower_components/jquery/dist/*","/plugins/bower_components/jquery/src/*","/plugins/bower_components/jquery/src/ajax/*",
				"/plugins/bower_components/jquery/src/attributes/*","/plugins/bower_components/jquery/src/core/*","/plugins/bower_components/jquery/src/css/*",
				"/plugins/bower_components/jquery/src/data/*","/plugins/bower_components/jquery/src/effects/*","/plugins/bower_components/jquery/src/event/*",
				"/plugins/bower_components/jquery/src/exports/*","/plugins/bower_components/jquery/src/manipulation/*","/plugins/bower_components/jquery/src/queue/*",
				"/plugins/bower_components/jquery/src/sizzle/*","/plugins/bower_components/jquery/src/traversing/*","/plugins/bower_components/jquery/src/var/*",
				"/plugins/bower_components/jquery/src/ajax/var/*","/plugins/bower_components/jquery/src/core/var/*","/plugins/bower_components/jquery/src/data/var/*",
				"/plugins/bower_components/jquery/src/css/var/*","/plugins/bower_components/jquery/src/manipulation/var/*","/plugins/bower_components/jquery/src/sizzle/dist/*",
				"/plugins/bower_components/jquery/src/traversing/*","/plugins/bower_components/raphael/dev/*","/plugins/bower_components/sidebar-nav/dist/*","/plugins/bower_components/sidebar-nav/src/*",
				"/plugins/bower_components/toast-master/js/*","/plugins/bower_components/toast-master/css/*","/plugins/bower_components/waypoints/lib/*",
				"/plugins/bower_components/waypoints/lib/shortcuts/*","/plugins/bower_components/morrisjs/less/*","/plugins/bower_components/morrisjs/lib/*","/plugins/bower_components/morrisjs/spec/*","/plugins/bower_components/morrisjs/examples/*",
				"/plugins/bower_components/morrisjs/examples/lib/*","/plugins/bower_components/morrisjs/spec/support/*","/plugins/bower_components/morrisjs/spec/lib/*",
				"/plugins/bower_components/morrisjs/spec/lib/area/*","/plugins/bower_components/morrisjs/spec/lib/bar/*","/plugins/bower_components/morrisjs/spec/lib/donut/*",
				"/plugins/bower_components/morrisjs/spec/lib/grid/*","/plugins/bower_components/morrisjs/spec/lib/line/*"

				).permitAll()
		.anyRequest().authenticated()
		.and()
		
		.formLogin().loginPage("/login")
		.loginProcessingUrl("/logincheck")
		.usernameParameter("username")
		.passwordParameter("password")
		.defaultSuccessUrl("/login/loginsuccess")
		.permitAll()
		.and()
		
		.logout().logoutUrl("/logout")
		.logoutSuccessUrl("/login?logout")
		.permitAll();
	}
	
}
