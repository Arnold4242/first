package com.example.demo.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@Import(SwaggerConfig.class)
@RestController
@RequestMapping("/api")
@Api(tags = "Your API")
public class FirstController {
	@Autowired
    private FirstRepository userRepository;

	public FirstController(FirstRepository userRepository) {
        this.userRepository = userRepository;
    }
	
//	@ApiOperation("Update a resource by ID")
//    @PutMapping("/resource/{id}")
//    public String updateResource(@PathVariable Long id, @RequestBody YourModel updatedResource) {
//        // Logic to handle PUT request and update a resource with the given ID
//        return "Resource with ID " + id + " updated successfully";
//    }
//
//    @ApiOperation("Delete a resource by ID")
//    @DeleteMapping("/resource/{id}")
//    public String deleteResource(@PathVariable Long id) {
//        // Logic to handle DELETE request for a resource with the given ID
//        return "Resource with ID " + id + " deleted successfully";
//    }
	 public String getAllUsers() {
	        return "Get all users";
	    }

	    @GetMapping("/{id}")
	    public String getUserById(@PathVariable Long id) {
	        return "Get user with ID: " + id;
	    }

	    @PostMapping
	    public String createUser(@RequestBody String user) {
	        return "Create user: " + user;
	    }

	    @PutMapping("/{id}")
	    public String updateUser(@PathVariable Long id, @RequestBody String user) {
	        return "Update user with ID " + id + ": " + user;
	    }

	    @DeleteMapping("/{id}")
	    public String deleteUser(@PathVariable Long id) {
	        return "Delete user with ID: " + id;
	    }

}
