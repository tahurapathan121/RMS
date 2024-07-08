package Entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	@Entity
	@Table(name = "admin")
	public class Admin {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "admin_id")
	    private int adminId;

	   
	    @Column(name = "admin_name")
	    private String adminName;

	    
	    @Column(name = "admin_phone")
	    private String adminPhone;

	   
	    @Column(name = "admin_email")
	    private String adminEmail;

	    
	    @Column(name = "admin_password")
	    private String adminPassword;

	    @OneToMany(mappedBy = "admin")
	    private List<Staff> staffList;
	}

