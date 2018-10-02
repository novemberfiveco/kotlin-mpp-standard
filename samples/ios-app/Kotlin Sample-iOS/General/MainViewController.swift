//
//  MainViewController.swift
//  Kotlin Test-iOS
//
//  Created by Vincent de Smet on 21/09/2018.
//  Copyright © 2018 November Five. All rights reserved.
//

import Foundation
import UIKit

// Import the Kotlin framework file
import MyLibrary

class MainViewController: UIViewController {

    @IBOutlet weak var titleLabel: UILabel!
    
    override func viewDidLoad() {

        // Create a new instance from the HelloWorld class and call the commonCode() function
        titleLabel.text = HelloWorld().commonCode()
    }
}
