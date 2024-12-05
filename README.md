# Jenkins Pipeline Showcase

This repository is part of an **Information Systems Methodologies** task. Its purpose is to help explain how Jenkins works, particularly focusing on Jenkins Pipelines and how they can be used for Continuous Integration (CI) and Continuous Deployment (CD).

---

## Purpose
The repository includes:
- A sample Java project for testing.
- A Jenkins Pipeline script to automate the build, test, and deploy stages.

---

## Getting Started

### Prerequisites
1. Install **Java JDK** (version 8 or later).
2. Install **Apache Maven** (ensure it's added to your system's PATH).
3. Install **Jenkins** on your machine (explained below).

---

## How to Set Up Jenkins

### 1. Install Jenkins on **Windows** or **macOS**

#### For **Windows**:
- Watch this video to install Jenkins on **Windows**: [Install Jenkins on Windows](https://www.youtube.com/watch?v=XuMrEDA8cAI).

#### For **macOS**:
- Watch this video to install Jenkins on **macOS**: [Install Jenkins on macOS](https://youtu.be/B7pv7n_c9XE?si=Bx39EOttTbq9Bbsr).

## Setting Up Maven in Jenkins
1. Go to **Manage Jenkins** > **Global Tool Configuration**.
2. Scroll down to **Maven**.
3. Click **Add Maven** and provide:
   - **Name**: `Maven`
   - **Install Automatically**: Check this box and choose a version (e.g., Maven 3.8.1).
4. Save the configuration.

---

## Steps to Create and Configure the Jenkins Job

1. **Create a New Job:**
   - From the Jenkins dashboard, click **New Item**.
   - Enter a name for the job (e.g., `Jenkins Pipeline Showcase`).
   - Choose **Pipeline** as the project type.
   - Click **OK** to create the job.

2. **Configure the Pipeline:**
   - Scroll down to the **Pipeline** section.
   - Set the **Definition** to **Pipeline script from SCM** if your repository uses a Jenkinsfile.  
     *Alternatively*, use the inline script:
     - Select **Pipeline script**.
     - Copy the pipeline script from `pipeline-script.txt` in this repository.

3. **Set Up Repository Access:**
   - In the pipeline script, update the repository URL to:
     ```bash
     https://github.com/HodaTouny/Jenkins-Pipeline-Showcase.git
     ```

4. **Configure Build Triggers:**
   - Enable **Poll SCM** to check for repository changes:
     - Go to the **Build Triggers** section.
     - Check **Poll SCM** and set the schedule:  
       ```bash
       H/5 * * * *
       ```
   - Set the duration between each repository check as needed to manage how often Jenkins polls for changes.

---

## Testing the Pipeline

1. **Run the Job:**
   - Click **Build Now** from the Jenkins job page.
   - Watch the **Console Output** to see the pipeline steps in action.

2. **Simulate a Repository Change:**
   - Make a small update to your repository (e.g., edit `README.md`) and push it.
   - Wait for Jenkins to detect the change and trigger a new build.

3. **Verify the Stages:**
   - Check the progress of the pipeline in Jenkins.
   - Ensure the following stages are executed:
     - Clone Repository
     - Build
     - Test
     - Dummy Deploy

---

## Pipeline Script

The complete pipeline script is available in the `pipeline-script.txt` file in this repository. Copy and paste it into Jenkins as described in the steps above.
