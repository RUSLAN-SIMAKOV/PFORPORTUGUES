# Publishing PT4UA on Google Play

Everything in this folder is ready to upload. The steps that need your Google account are below.

## What is in this folder

| File | Where it goes in Play Console |
|---|---|
| `listing-uk.txt` | Main store listing (Ukrainian, default language) |
| `listing-en.txt` | Optional English translation of the listing |
| `icon-512.png` | Store listing → App icon |
| `feature-graphic-1024x500.png` | Store listing → Feature graphic |
| `screenshots/01…05.png` | Store listing → Phone screenshots |
| `privacy-policy.md` | App content → Privacy policy (needs a public link, see step 4) |

## 1. Developer account

Create it at https://play.google.com/console (one-time fee of 25 USD, identity verification).

New **personal** accounts must run a **closed test with at least 12 testers for 14 days in a row** before they can publish to everyone (step 7). Organization accounts skip this.

## 2. Build the signed app bundle (Android Studio)

1. **Build → Generate Signed App Bundle or APK → Android App Bundle → Next.**
2. **Create new…** key store. Save the `.jks` file **outside** the project folder, choose strong passwords, and keep a backup of the file and the passwords. Without them you cannot publish updates.
3. Choose **release** → **Create**. The file appears in `app/release/app-release.aab`.

Google Play App Signing is on by default: Google keeps the final signing key, and your `.jks` is only the upload key.

## 3. Create the app

Play Console → **Create app**: name `PT4UA – Португальська мова`, default language **Ukrainian (uk-UA)**, App, Free.

## 4. Privacy policy link

Commit and push `store/privacy-policy.md` first (your contact email is already in it). Then use:

`https://github.com/RUSLAN-SIMAKOV/PFORPORTUGUES/blob/master/store/privacy-policy.md`

## 5. App content (Policy → App content)

| Section | Answer |
|---|---|
| Privacy policy | the link from step 4 |
| App access | All functionality is available without special access |
| Ads | No, my app does not contain ads |
| Content rating | Category: Reference, News, or Educational; answer **No** to every question (expected result: Everyone / PEGI 3) |
| Target audience | 13+ or 18+ (avoids the extra rules for apps aimed at children) |
| Data safety | Does your app collect or share user data? **No** |
| Government app / Financial features / Health / News | No / None / No / No |

## 6. Store listing

Paste the texts from `listing-uk.txt`, upload the icon, the feature graphic and the 5 screenshots. Category: **Education**.

**Store settings → Store listing contact details:** email `ua667766706@gmail.com`; website `https://www.linkedin.com/in/rsimakov` (optional).

## 7. Testing and release

1. **Testing → Closed testing → Create track** → upload `app-release.aab` → add at least 12 testers (an email list or a Google Group).
2. Send testers the opt-in link; they install the app from Google Play.
3. After 14 days, **apply for production access**, then create a **Production** release with the same bundle.

## Updates

Before each new upload, increase `versionCode` (and `versionName`) in `app/build.gradle.kts`.
